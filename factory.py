__author__ = 'TPei'


class Monster:
    def __init__(self):
        self.hitpoints = 100
        self.life = 100

    def sound(self):
        print("raaaa")

    def get_type(self):
        print("unidentified monster")


class Zombie(Monster):
    def __init__(self):
        super().__init__()
        self.hitpoints = 200
        self.life = 30

    def sound(self):
        print("khhhhh")

    def get_type(self):
        print("zombie")

class Alien(Monster):
    def __init__(self):
        super().__init__()
        self.hitpoints = 50

    def sound(self):
        print("beeep beep booop beep")

    def get_type(self):
        print("alien")

class MonsterFactory:
    def make_monster(self, type):
        if type == 'zombie':
            return Zombie()
        elif type == 'alien':
            return Alien()
        else:
            return Monster()


monster = MonsterFactory().make_monster('zombie')
monster.get_type()
print(monster.life)
print(monster.hitpoints)
monster.sound()

