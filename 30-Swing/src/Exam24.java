import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

class Swing24 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("JTree!!", JLabel.CENTER);
	DefaultMutableTreeNode node = new DefaultMutableTreeNode("root");
	DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Lesson");
	DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("System");
	DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Design");
	DefaultMutableTreeNode node11 = new DefaultMutableTreeNode("Java");
	DefaultMutableTreeNode node12 = new DefaultMutableTreeNode("XML");
	DefaultMutableTreeNode node111 = new DefaultMutableTreeNode("Beg");
	DefaultMutableTreeNode node112 = new DefaultMutableTreeNode("Adv");
	DefaultMutableTreeNode node113 = new DefaultMutableTreeNode("JSP");
	DefaultMutableTreeNode node121 = new DefaultMutableTreeNode("XSLT");
	DefaultMutableTreeNode node122 = new DefaultMutableTreeNode("DOM");
	// tree의 시작점 설정
	DefaultTreeModel treeModel = new DefaultTreeModel(node);	//출발노드설정
	JTree tree = new JTree(treeModel);
	JScrollPane scrollPane = new JScrollPane(tree);
	
	public Swing24() {
		// Frame 기본 설정
		setSize(300, 300);
		setTitle("Swing24");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", scrollPane);
		// tree에 노드 추가
		node.add(node1);
		node.add(node2);
		node.add(node3);
		
		node1.add(node11);
		node1.add(node12);
		
		node11.add(node111);
		node11.add(node112);
		node11.add(node113);
		
		node12.add(node121);
		node12.add(node122);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam24 {
	public static void main(String[] args) {
		new Swing24();
	}
}
