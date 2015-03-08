__author__ = 'TPei'


def singleton(cls):
    '''
    python singleton module
    :param cls:
    :return:
    '''
    obj = cls()
    cls.__new__ = staticmethod(lambda cls: obj)

    try:
        del cls.__init__
    except AttributeError:
        pass
    return cls

@singleton
class Duck(object):
    pass

if Duck() is Duck():
    print("it works")
else:
    print("it doesn't work")
