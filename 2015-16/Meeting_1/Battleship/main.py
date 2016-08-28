__author__ = 'maxomdal'

#Battleship

import random

myArray = []
boardSize = int(raw_input("Please insert the board's desired size."))
def makeEnemyFleet(numberOfShips):
    total = []
    length = 3
    
    def has_duplicates(values):
        # For each element, check all following elements for a duplicate.
        for i in range(0, len(values)):
            for x in range(i + 1, len(values)):
                if values[i] == values[x]:
                    return True
        return False
    
    for i in range(numberOfShips):
        total += makeEnemyShip(length)
        def fix_duplicates(total):
            if has_duplicates(total):
                print total
                del total[-3:]
                total += makeEnemyShip(length)
                fix_duplicates(total)
            else:
                pass
        fix_duplicates(total)

    return total

def makeEnemyShip(length):

    shipArray = []
    alignment = random.choice([True,False])

    if alignment == True:
        col = random.randrange(1, boardSize+1)
        row = random.randrange(length, boardSize+1)
        for x in range(length):
            shipArray.append([col, row - x])
    else:
        col = random.randrange(length, boardSize+1)
        row = random.randrange(1, boardSize+1)
        for x in range(length): #builds a horizontal ship
            shipArray.append([col - x, row])

    return shipArray

def makeEnemyBoard():
    array = []
    for x in range(boardSize):
        array.append(["O"]*boardSize)
    return array

def printBoard(enemyBoard):
    stringBoard = ""
    for items in enemyBoard:
        stringBoard += str(items) + "\n"
    print stringBoard

def myMove(enemyBoard, enemy, attack):
    if attack == "reveal":
        print enemy
    else:
        attack = attack.split(",")
        attack = list(map(int, attack))
    if attack in enemy:
        print "you hit your enemy's battleship at point" + str(attack)
        enemyBoard[attack[1] - 1][attack[0] - 1] = 'X'
        enemy.remove(attack)
    else:
        print "you missed your enemy's battleship"
    printBoard(enemyBoard)
    if len(enemy) == 0:
            print "you sunk their battleship!"
            answer = raw_input("Would you like to play again? Y/N")
            if answer == "Y":
                newBoard = makeEnemyBoard()
                newShip = makeEnemyShip(3)
                myMove(newBoard, newShip, raw_input("Make Your Move:"))
    myMove(enemyBoard, enemy, raw_input("Make Your Move:"))

myMove(makeEnemyBoard(), makeEnemyFleet(3), raw_input("Make Your Move:"))
