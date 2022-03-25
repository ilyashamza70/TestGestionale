package TabbedPane;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TabbedPane extends JTabbedPane implements JFrame{
    JTabbedPane tabbedPane = new JTabbedPane();
    ImageIcon icon = createImageIcon ("images/middle.gif");

    JComponent panel1 = makeTextPanel("Panel #1");
    JTabbedPane.addTab("Tab 1", null, panel1,"Does nothing");
    JTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

    JComponent panel2 = makeTextPanel("Panel #2");
    JTabbedPane.addTab("Tab 2", icon, panel2,
            "Does twice as much nothing");
    JTabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

    JComponent panel3 = makeTextPanel("Panel #3");
    JTabbedPane.addTab("Tab 3", icon, panel3,
            "Still does nothing");
tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

    JComponent panel4 = makeTextPanel(
            "Panel #4 (has a preferred size of 410 x 50).");
panel4.setPreferredSize(new Dimension(410, 50));
tabbedPane.addTab("Tab 4", icon, panel4,
            "Does nothing at all");
tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
}
