###### Max Omdal ######
###### Code Club 2016 #######

## Numbers ##


### Binary ###

- Binary is what all computers are based on

- Is a numeral system with base (radix) 2. The Decimal system uses base 10.


    Examples:
    0001 = 0*(2^3) + 0*(2^2) + 0*(2^1) + 1*(2^0) = 1
    0101 = 0*(2^3) + 1*(2^2) + 0*(2^1) + 1*(2^0) = 5
    1000 = 1*(2^3) + 0*(2^2) + 0*(2^1) + 0*(2^0) = 8


- Each 1 or 0 is referred to as a bit

- 8 bits makes a byte

- Four bytes makes an integer


    Try Yourself:
    0010
    1100
    0111
    1111




### Hexadecimal ###

- Hexadecimal is a numeral system with base 16

- In the hex system, numbers 0-9 and letters A-F represent 0-15.


| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | A  | B  | C  | D  | E  | F |
|--- |--- |--- |--- |--- |--- |--- |--- |--- |--- |--- |--- |--- |--- |--- |---|
| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15|


- So, if we have the Hexadecimal number C2A, we can break it down:


    C = 12
    2 = 2
    A = 10

    C2A = C(16^2) + 2(16^1) + A(16^0)
    C2A = 12(16^2) + 2(16^1) + 10(16^0)
    C2A = 3114

- The hexadecimal system is denoted on the AP test with the subscript *hex*


    Try Yourself:
    E6A
    01A


- Now that we can convert binary to decimal, and hex to decimal, we can convert binary to hex!


    Binary -> Decimal:  0101 = 5
    Hex    -> Decimal:  0005 = 5
    Binary -> Hex:      0101 = 0005


### Integers ###

- An integer is referred to as a primitive, or a *built-in* type. Integers are made up of 32 bits

- Integers have no decimal points

- The largest integer is 2^31 - 1. The smallest is -2^31. This has to do with the fact integers are stored as 4 bytes




### Doubles ###

- Doubles use 8 bits and are a primitive

- Must be stored in two parts: The mantissa (determines its number of digits), and an exponent
