
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ArraysGraphics {
    private JPanel mainPanel;
    private JButton buttonOne;

    public static void main(String[] args) {
        ArraysGraphics program = new ArraysGraphics();
    }

    public ArraysGraphics() {
        JFrame frame = new JFrame("ArraysGraphics");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUIComponents();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonOne.setText("Drew your Array!");
                mainPanel.add(new DisplayGraphics(new Color[][]{{Color.RED, Color.WHITE, Color.BLUE}, {Color.GREEN},
                        {Color.WHITE, Color.RED, Color.BLUE}}));
            }
        });

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 0));
        buttonOne = new JButton();
        buttonOne.setText("Button");
        mainPanel.add(buttonOne, BorderLayout.NORTH);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

    class DisplayGraphics extends Canvas {
        private Color[][] dataset;

        public DisplayGraphics(Color[][] input) {
            super();
            dataset = input;
        }

        public void paint(Graphics g) {
            int pixelsPerItemVer = getHeight() / dataset.length;

            //TODO: Make a loop which iterates through our array and draws the colour at that element in the right
            // place. This must do a few things: Calculate the size of each color and all.

            for (int i = 0; i < dataset.length; i++) {
                int lengthAtThisIndex = dataset[i].length;
                int pixelsPerItemHorAtIndex = getWidth() / lengthAtThisIndex;
                for (int j = 0; j < dataset[i].length; j++) {   //TODO: [INSTR] Show error here by putting i++
                    g.setColor(dataset[i][j]);
                    g.fillRect(j * pixelsPerItemHorAtIndex, i * pixelsPerItemVer, getWidth() / lengthAtThisIndex,
                            getHeight() / dataset.length);
                }
            }
        }


        /*
         * This method is used to calculate how many pixels each colour should take up. So if we have a window of
         * width 100 and a longest horizontal array of 10, it will return 10.
         * <p>
         * Notice how we don't care what the array is of
         */
        private int getLongestElement(Object[][] input) {
            //TODO: This method must iterate through the dataset array and return the longest array!


            //---------------------- Solution code 1 ----------------------

/*
            int largest = 0;
            for(int i = 0; i < input.length; i++){
                if(input[i].length > largest){
                    largest = input[i].length;
                }
            }
            return largest;
*/

            //--------------------- End of Solution 1 -----------------------


            //---------------------- Solution code 2 ----------------------
            int largest = 0;
            for (Object[] objects : input) {
                if (objects.length > largest) {
                    largest = objects.length;
                }
            }
            return largest;
            //--------------------- End of Solution 2 -----------------------

        }

    }
}
