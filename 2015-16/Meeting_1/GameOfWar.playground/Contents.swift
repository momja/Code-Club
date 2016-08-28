//: Playground - noun: a place where people can play

import UIKit

var cards: [Int] = []

var hand1: [Int] = []
var hand2: [Int] = []

for i in 1...13{
    for x in 1...4{
        cards.append(i)
    }
}

print(cards)

for i in 0...cards.count{
    let random = arc4random_uniform(UInt32(52))
    if i % 2 == 0 {
        hand1.append(cards[Int(random)])
    }
    else {
        hand2.append(cards[Int(random)])
    }
    print(hand1)
    print(hand2)
}

while hand1.count != 0 || hand2.count != 0 {
    
    if hand1[0] > hand2[0] {
        hand1.append(hand2[0])
        hand2.removeAtIndex(0)
    }
    
    else if hand2[0] > hand1[0] {
        hand2.append(hand1[0])
        hand1.removeAtIndex(0)
    }
    
    else {
        let warArrayHand1 = hand1[1...3]
        let warArrayHand2 = hand2[1...3]
        
        if hand1[4] > hand2[4] {
            hand1 += warArrayHand2
            hand2.removeRange(0...4)
        }
        
        else if hand2[4] > hand1[4] {
            hand2 += warArrayHand1
            hand1.removeRange(0...4)
        }
        
    }
    
    print(hand1.count)
    print(hand2.count)
    
    print(hand1)
    print(hand2)
    
}

