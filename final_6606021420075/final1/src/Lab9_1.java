// File Name : Lab9_1.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class Lab9_1 extends JFrame implements ActionListener {
	Student std[];
	Subject sub[];
	String[] studentStr, subjectStr;
	Container container;
	JComboBox<String> stdCombo, subCombo;
	JLabel stdLabel, subLabel, scoreLabel;
	JButton addstdBtn, addsubBtn, saveBtn, clearBtn, cancleBtn;
	JTextField stdText, scoreText;
	JTextArea subTextArea;
	JScrollPane subScroll;
	Register reg;
	int count = 0;

	/** Creates a new instance of Lab9_1 */
	public Lab9_1() {
		super("Program Student Register");
		initStudent();
		initSubject();
		initGui();
		reg = new Register(new Student(), 5);
	}

	public void initStudent() {
		std = new Student[3];
		studentStr = new String[3];
		std[0] = new Student("6606021420018", "Somchai", "Rakchart");
		std[1] = new Student("6606021420024", "Doungporn", "Puangdai");
		std[2] = new Student("6606021420037", "Gornwit", "Mongkol");
		studentStr[0] = std[0].getStudentCode() + " " + std[0].getStudentName() + " " + std[0].getStudentSurName();
		studentStr[1] = std[1].getStudentCode() + " " + std[1].getStudentName() + " " + std[1].getStudentSurName();
		studentStr[2] = std[2].getStudentCode() + " " + std[2].getStudentName() + " " + std[2].getStudentSurName();
	}

	public void initSubject() {
		sub = new Subject[5];
		subjectStr = new String[5];
		sub[0] = new Subject("060223117", "ITI OOP Laboratory", 1);
		sub[1] = new Subject("060223009", "Data Structure", 3);
		sub[2] = new Subject("060223110", "Database System", 3);
		sub[3] = new Subject("060223213", "Data Communication", 3);
		sub[4] = new Subject("060223132", "Object Oriented Programming", 3);
		subjectStr[0] = sub[0].getSubjectCode() + " " + sub[0].getSubjectName() + " " + sub[0].getSubjectCredit();
		subjectStr[1] = sub[1].getSubjectCode() + " " + sub[1].getSubjectName() + " " + sub[1].getSubjectCredit();
		subjectStr[2] = sub[2].getSubjectCode() + " " + sub[2].getSubjectName() + " " + sub[2].getSubjectCredit();
		subjectStr[3] = sub[3].getSubjectCode() + " " + sub[3].getSubjectName() + " " + sub[3].getSubjectCredit();
		subjectStr[4] = sub[4].getSubjectCode() + " " + sub[4].getSubjectName() + " " + sub[4].getSubjectCredit();
	}

	public void initGui() {
		container = getContentPane();
		container.setLayout(new FlowLayout());

		stdLabel = new JLabel("Select Student : ");
		container.add(stdLabel);
		stdCombo = new JComboBox<String>(studentStr);
		stdCombo.setMaximumRowCount(3);

		container.add(stdCombo);
		addstdBtn = new JButton("Add Student");
		addstdBtn.addActionListener(this);
		container.add(addstdBtn);
		stdText = new JTextField(40);
		stdText.setEditable(false);
		container.add(stdText);

		subLabel = new JLabel("      Select Subject : ");
		container.add(subLabel);
		subCombo = new JComboBox<String>(subjectStr);
		subCombo.setMaximumRowCount(5);
		container.add(subCombo);
		scoreLabel = new JLabel("      Enter Total Score of Subject : ");
		container.add(scoreLabel);
		scoreText = new JTextField(10);
		container.add(scoreText);
		addsubBtn = new JButton("Add Subject");
		addsubBtn.setEnabled(false);
		addsubBtn.addActionListener(this);
		container.add(addsubBtn);
		subTextArea = new JTextArea(5, 50);
		subTextArea.setEditable(false);
		subScroll = new JScrollPane(subTextArea);
		container.add(subScroll);

		saveBtn = new JButton(" Save ");
		saveBtn.setEnabled(false);
		saveBtn.addActionListener(this);
		container.add(saveBtn);

		cancleBtn = new JButton(" Cancle ");
		cancleBtn.setEnabled(false);
		cancleBtn.addActionListener(this);
		container.add(cancleBtn);
		setSize(520, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == addstdBtn) {
			int n = stdCombo.getSelectedIndex();
			stdText.setText(std[n].getStudentCode() + " " + std[n].getStudentName() + " " + std[n].getStudentSurName());
			std[n].setStudentDept("information Technology");
			reg.setStudent(std[n]);
			addstdBtn.setEnabled(false);
			addsubBtn.setEnabled(true);
			saveBtn.setEnabled(true);
			cancleBtn.setEnabled(true);
		} else if (event.getSource() == addsubBtn) {
			int n = subCombo.getSelectedIndex();
			sub[n].setSubjectTotal(Integer.parseInt(scoreText.getText()));
			sub[n].setSubjectGrade(Cal(Integer.parseInt(scoreText.getText())));
			subTextArea.append(sub[n].toString() + "\n");
			reg.setSubject(sub[n], count);
			count++;
			if (count == 5)
				addsubBtn.setEnabled(false);
		} else if (event.getSource() == saveBtn) {
			String output = "";
			output = "Student :" + reg.getStudent();
			output += "\n\nSubject:\n";
			for (int n = 0; n < count; n++)
				output += reg.getSubject(n) + "\n";
			JOptionPane.showMessageDialog(this, output,"Registration Data", JOptionPane.INFORMATION_MESSAGE);
			resetBtn();
		} else if (event.getSource() == cancleBtn) {
			stdText.setText("");
			subTextArea.setText("");
			count = 0;
			resetBtn();
		}
	}

	public String Cal(int score){
		String g = "";
		if (score >= 0 && score <= 100) {
			if (score >= 80) {
				g = "A";
			}else if(score >= 75){
				g = "B+";
			}else if(score >= 70){
				g = "B";
			}else if(score >= 65){
				g = "C+";
			}else if(score >= 60){
				g = "C";
			}else if(score >= 55){
				g = "D+";
			}else if(score >= 50){
				g = "D";
			}else{
				g = "F";
			}
		}
		return g;
	}

	public void resetBtn() {
		addstdBtn.setEnabled(true);
		addsubBtn.setEnabled(false);
		saveBtn.setEnabled(false);
		cancleBtn.setEnabled(false);
		stdText.setText("");
		subTextArea.setText("");
	}

	public static void main(String[] args) {

		Lab9_1 lab9_1 = new Lab9_1();
	}
}
