name = raw_input("Whats your name?")
print("Hello, nice to meet you " + name)

event1 = raw_input("So there you were, sitting in the valley. In your hands is a piece of chicken. In your pockets is a knife. (1) Cut the chicken. (2) Leave the valley.")
if (event1 == "1"):
    event2 = raw_input("You cut the chicken. Then you pop some in yo mouth. (1) Put some ketchup on that. (2) Stop eating it, it tastes gross.")
    if (event2 == "1"):
        event3 = raw_input("MMM. That ketchup tastes good. (1) Eat some more. (2) Get outta there.")
    elif (event2 == "2"):
        event3 = raw_input("You don't eat the chicken. There might be a chipotle somewhere. (1) Go find it. (2) Ahh. Just take a nap.")
elif (event1 == "2"):
    event2 = raw_input("You leave the valley. Outside of the valley, there is a Burger King. (1) Go inside. (2) Keep walking, theres something better out there.")
                           
