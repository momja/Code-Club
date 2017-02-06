# website: https://repl.it/languages/python

name = raw_input("what is your name?")
print("hello " + name + ", would you like to go on an adventure?")
answer1 = raw_input()
if answer1=="yes":
  print("Whipee! Get ready for the adventure of a lifetime!!!")
  answer2 = raw_input("Do you prefer the ocean or the jungle?")
  if answer2 == "ocean":
    print("Ah yes. There you were, watching a beautiful senset across the icy waves of the arctic sea")
  else:
    print("A jungle fellow, eh? Let us begin our tale. There you are " + name + ", sitting upon a low-hanging branch, watching the toucans dance about with their colorful beaks")


else:
  print("Party pooper...")
