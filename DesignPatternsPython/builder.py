__author__ = 'TPei'


class Person:
    def __init__(self, builder):
        self.first_name = builder.first_name
        self.last_name = builder.last_name
        self.telephone = builder.telephone
        self.address = builder.address
        self.age = builder.age


class PersonBuilder:
    def __init__(self, first_name, last_name):
        # mandatory person fields
        self.first_name = first_name
        self.last_name = last_name
        self.telephone = None
        self.address = None
        self.age = None

    #optionals

    def add_telephone(self, telephone):
        self.telephone = telephone
        return self

    def add_address(self, address):
        self.address = address
        return self

    def add_age(self, age):
        self.age = age
        return self

    def build(self):
        return Person(self)


person = PersonBuilder('thomas', 'peikert').add_age(25).add_telephone("046149379891").build()
print(person.first_name)
print(person.last_name)
print(person.telephone)
print(person.address)
print(person.age)