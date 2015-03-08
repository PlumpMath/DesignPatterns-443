__author__ = 'TPei'


class Observable:
    '''
    class that can be observed
    '''
    def __init__(self):
        '''
        make empty observer list
        :return:
        '''
        self.observers = []

    def register_observer(self, observer):
        '''
        register an observer
        :param observer: observer class instance
        :return:
        '''
        self.observers.append(observer)

    def unregister_observer(self, observer):
        '''
        remove an object from the observer list
        :param observer: registered observer
        :return:
        '''
        self.observers.remove(observer)

    def notify_observers(self, *args, **kwargs):
        '''
        notify all observers
        :param args: some arguments
        :param kwargs: some kw arguments
        :return:
        '''
        for observer in self.observers:
            observer.update(*args, **kwargs)


class Observer:
    '''
    observer class
    observes an observable
    '''
    def __init__(self, observable):
        '''
        automatically register an observer to a given observable
        :param observable:
        :return:
        '''
        observable.register_observer(self)

    def update(self, *args, **kwargs):
        '''
        this is automatically called from the observable class
        :param args:
        :param kwargs:
        :return:
        '''
        print('got:', *args, **kwargs)

# make observable and an observer
trigger = Observable()
listener = Observer(trigger)
# trigger a notification
trigger.notify_observers('hallo', 'was geht', 'yolo')
# unregister observer
trigger.unregister_observer(listener)
# no registered observers, so notification has no effect
trigger.notify_observers('hallo2')