import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot extends JFrame{

    // user input
    private JTextField txtInput = new JTextField();

    // conversation
    private JTextArea txtArea = new JTextArea();

    public Bot(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("I'm ready to talk )) ");

        txtInput.setLocation( 20, 525 );
        txtInput.setSize(560, 30);
        this.add(txtInput);

        txtInput.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent arg){
                String text = txtInput.getText();
                txtArea.append("you: " + text + "\n");

                if(text.toLowerCase().contains("hi")){
                    botSay( "Hello" );
                }else if(text.toLowerCase().contains( "how are you" )){
                    int randomAnswer = (int) (Math.random()*2+1);
                    if(randomAnswer == 1){
                        botSay( "I'm fine, thank you, and you?" );
                    } else if(randomAnswer == 2)
                    {
                        botSay( "So so" );
                    }
                }else{
                    int randomAnswer = (int) (Math.random()*3+1);
                    if(randomAnswer == 1){
                        botSay( "repeat pls, I do not understand" );
                    } else if(randomAnswer == 2){
                        botSay("Yeah, you right!");
                    } else if(randomAnswer == 3){
                        botSay("what?");
                    }
                }

                txtInput.setText("");
            }
        });

        txtArea.setLocation(20, 5);
        txtArea.setSize(560, 510);
        txtArea.setEditable(false);
        this.add(txtArea);
    }

    public void botSay(String someText){
        txtArea.append("bot: " + someText + "\n");
    }
}
