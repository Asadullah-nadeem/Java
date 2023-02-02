import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentMgmtApp {
    private String[] colName = new String[]{"Delete", "Id", "Name", "Age", "Standard"};
    private static Object[][] studentList = new Object[][]{{false, 1, "student", 23, 12}};

    private DefaultTableModel studentModel;
    private JTable studentTable;

    private StudentMgmtApp (){

        JFrame jFrame = new JFrame("Student Management Application");
        jFrame .setBounds(100, 100, 500, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        CreateUpdateStudentPanel createUpdateStudentPanel = new
                CreateUpdateStudentPanel();
        ReadDeleteStudentPanel readDeleteStudentPanel = new
                ReadDeleteStudentPanel();
        tabbedPane.addTab("Create Student", createUpdateStudentPanel);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        tabbedPane.addTab("Read/Delete Student", readDeleteStudentPanel);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        jFrame.setContentPane(tabbedPane);
        jFrame.setVisible(true);
    }

    public static void main(String[] args){
        new StudentMgmtApp();
    }

    private static JTextField addLabelAndTextField(String lableText, int yPos, Container containingPanel){

        JLabel label = new JLabel(lableText);
        GridBagConstraints gridBagConstraintsForLabel = new GridBagConstraints();
        gridBagConstraintsForLabel.fill = GridBagConstraints.BOTH;
        gridBagConstraintsForLabel.insets = new Insets(0,0, 5,5);
        gridBagConstraintsForLabel.gridx = 0;
        gridBagConstraintsForLabel.gridy = yPos;
        containingPanel.add(label, gridBagConstraintsForLabel);

        JTextField textField = new JTextField();
        GridBagConstraints gridBagConstraintsForTextField = new GridBagConstraints();
        gridBagConstraintsForTextField.fill = GridBagConstraints.BOTH;
        gridBagConstraintsForTextField.insets = new Insets(0,0,5,0);

        gridBagConstraintsForTextField.gridx=1;
        gridBagConstraintsForTextField.gridy=yPos;
        containingPanel.add(textField, gridBagConstraintsForTextField);
        textField.setColumns(10);

        return textField;
    }
    private static JButton addButton(String btnText, int yPos, Container containingPanel) {
        JButton button = new JButton(btnText);
        GridBagConstraints gridBagConstraintsForButton = new GridBagConstraints();
        gridBagConstraintsForButton.fill = GridBagConstraints.BOTH;
        gridBagConstraintsForButton.insets = new Insets(0,0, 5, 5);
        gridBagConstraintsForButton.gridx = 0;
        gridBagConstraintsForButton.gridy = yPos;
        containingPanel.add(button, gridBagConstraintsForButton);
        return button;
    }
    private static void append(Object [][] array, Object[] value){
        Object[][] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = value;
        StudentMgmtApp.studentList = result;
    }

    public class CreateUpdateStudentPanel extends  JPanel{

        private JTextField idTextField;
        private JTextField nameTextField;
        private JTextField ageTextField;
        private JTextField stdTextField;

        CreateUpdateStudentPanel() {
            Border border = getBorder();
            Border margin = new EmptyBorder(10,10,10, 10);
            setBorder(new CompoundBorder(border, margin));

            GridBagLayout panelGridBagLayout = new GridBagLayout();
            panelGridBagLayout.columnWidths = new int[] {86, 86, 0};
            panelGridBagLayout.rowHeights = new int[]{20,20,20,20,20,0};
            panelGridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
            panelGridBagLayout.rowWeights = new double[]{0.0,0.0, 0.0,0.0,0.0, Double.MIN_VALUE};
            setLayout(panelGridBagLayout);
            idTextField = StudentMgmtApp.addLabelAndTextField("ID :", 0, this);
            nameTextField = StudentMgmtApp.addLabelAndTextField("name :", 1, this );
            ageTextField = StudentMgmtApp.addLabelAndTextField("age :", 2 , this);
            stdTextField = StudentMgmtApp.addLabelAndTextField("Student :", 3, this );
            JButton createStudentBtn = StudentMgmtApp.addButton("Create", 4, this);

            createStudentBtn.addActionListener(e -> createStudent());
        }
        private void createStudent(){
            String studentId = idTextField.getText();
            String studentName = nameTextField.getText();
            String studentAge = ageTextField.getText();
            String studentStd = stdTextField.getText();

            Object[] studentData = new Object[]{false, studentId, studentName, studentAge, studentStd};
            StudentMgmtApp.append(StudentMgmtApp.studentList,studentData);
            studentModel.addRow(studentData);

            idTextField.setText("");
            nameTextField.setText("");
            ageTextField.setText("");
            stdTextField.setText("");
        }
    }
    public class ReadDeleteStudentPanel extends JPanel{

        ReadDeleteStudentPanel(){
            setPreferredSize(new Dimension(400, 200));
            JButton deleteButton = StudentMgmtApp.addButton("Delete", 0, this);
            deleteButton.addActionListener(e -> deleteStudent());
            studentModel = new DefaultTableModel(StudentMgmtApp
                    .studentList, colName);
            studentTable = new JTable(studentModel){

                @Override
                public  Class<?> getColumnClass(int column){
                    switch (column){
                        case 0:
                            return Boolean.class;
                        case 1:
                            return String.class;
                        case 2:
                            return String.class;
                        case 3:
                            return String.class;
                        case 4:
                            return String.class;
                        default:
                            return Boolean.class;
                    }
                }
            };
            //Turn off
            studentTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            JScrollPane pane = new JScrollPane(studentTable);
            add(pane, BorderLayout.CENTER);
        }
        private void deleteStudent(){
            DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
            for (int i=0; i<model.getRowCount(); i++){
                Boolean checked = (Boolean) model.getValueAt(i , 0);
                if (checked != null && checked){
                    model.removeRow(i);
                    i++;
                }
            }
        }
    }
}
