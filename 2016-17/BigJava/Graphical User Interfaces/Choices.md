# Choices

Radio Buttons: one button can be selected at a time

![radio button](http://www.java2s.com/Code/JavaImages/RadioButtonDemo.PNG "radio button")

```java
JRadioButton button = new JRadioButton("Button-Name");
```
- group radio buttons together with ButtonGroup class
```java
JRadioButton button1 = new JRadioButton("Button-Name1");
JRadioButton button2 = new JRadioButton("Button-Name2");
JRadioButton button3 = new JRadioButton("Button-Name3");

ButtonGroup group = new ButtonGroup();
group.add(button1);
group.add(button2);
group.add(button3);
```

- isSelected() method returns whether button is selected
- setSelected(true) to one of the buttons before running frame
- you can add a border to panels to organize the layout of a window
  - setBorder()
    - there are lots of different border types. One is EtchedBorder()
- combo boxes are useful for making dropdown options

![combo box](https://i-msdn.sec.s-msft.com/dynimg/IC50924.gif "combo box")

```java
JComboBox facenameCombo = new  JComboBox();
facenameCombo.addItem("Serif");
facenameCombo.addItem("SansSerif")
```

- to get the name of an value in a comboBox:
```java
String selectedString = (String) facenameCombo.getSelectedItem();
```
