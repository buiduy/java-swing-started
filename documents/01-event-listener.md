
|Các lớp Event	|Các interface Listener|
|----|---|
|ActionEvent |	ActionListener|
|MouseEvent |	MouseListener and MouseMotionListener|
|MouseWheelEvent |	MouseWheelListener|
|KeyEvent |	KeyListener|
|ItemEvent |	ItemListener|
|TextEvent |	TextListener|
|AdjustmentEvent |	AdjustmentListener|
|WindowEvent |	WindowListener|
|ComponentEvent |	ComponentListener|
|ContainerEvent |	ContainerListener|
|FocusEvent |	FocusListener|

# Registery
```aidl
Button
public void addActionListener(ActionListener a){}
MenuItem
public void addActionListener(ActionListener a){}
TextField
public void addActionListener(ActionListener a){}
public void addTextListener(TextListener a){}
TextArea
public void addTextListener(TextListener a){}
Checkbox
public void addItemListener(ItemListener a){}
Choice
public void addItemListener(ItemListener a){}
List
public void addActionListener(ActionListener a){}
public void addItemListener(ItemListener a){}
```
