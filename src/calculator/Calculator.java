package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import java.text.DecimalFormat;
import javafx.stage.StageStyle;

/**
 * This program is a recreation of the basic calculator from OSX Yosemite that 
 * satisfies the requirements for CS 3250 Project 7
 * @author eric shields
 * @version 1.00 2014-12-7
 */
public class Calculator extends Application 
{
    private static final double PANE_WIDTH = 235;
    private static final double PANE_HEIGHT = 320;
    private static final double TWO = 2;
    private static final double THREE = 3;
    private static final double FOUR = 4;
    private static final double FIVE = 5;
    private static final double SIX_POINT_FIVE = 6.5;
    private static final double FONT_SIZE = 24;
    private static final double ONE_HUNDRED = 100;
    private static final String ZERO = "0";
    
    String operand1 = "0";
    String operand2 = "0";
    String output = "0";
  
    String temp = "0";
    
    int dotCount = 0;
    int addCount = 0;
    int subCount = 0;
    int multiplyCount = 0;
    int divideCount = 0;
    int functionID = 0;
    
    boolean firstEquals = true;
    
    @Override
    public void start(Stage primaryStage) 
    {
        Label myText = new Label();
        myText.setAlignment(Pos.CENTER_RIGHT);
        myText.setText(operand1);
        myText.setFont(Font.font(FONT_SIZE));
        myText.setStyle("-fx-text-fill: #FAFAFA; -fx-background-color: #848484;");
      
        myText.setMinHeight(PANE_HEIGHT/SIX_POINT_FIVE);
        myText.setMinWidth(PANE_WIDTH);
        
        Button zeroBtn = new Button();

        zeroBtn.setText("0");
        zeroBtn.setFont(Font.font(FONT_SIZE));
        zeroBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        zeroBtn.setMinWidth(PANE_WIDTH/ TWO);
        zeroBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (!output.equals(ZERO))
                {
                    output = output.concat(ZERO);
                }
                
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button oneBtn = new Button();
  
        oneBtn.setText("1");
        oneBtn.setFont(Font.font(FONT_SIZE));
        oneBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        oneBtn.setMinWidth(PANE_WIDTH/ FOUR);
        oneBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "1";
                    
                }
                
                else
                {
                    output = output.concat("1");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button twoBtn = new Button();
       
        twoBtn.setText("2");
        twoBtn.setFont(Font.font(FONT_SIZE));
        twoBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        twoBtn.setMinWidth(PANE_WIDTH/ FOUR);
        twoBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "2";
                    
                }
                
                else
                {
                    output = output.concat("2");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button threeBtn = new Button();
    
        threeBtn.setText("3");
        threeBtn.setFont(Font.font(FONT_SIZE));
        threeBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        threeBtn.setMinWidth(PANE_WIDTH/ FOUR);
        threeBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "3";
                }
                
                else
                {
                    output = output.concat("3");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button fourBtn = new Button();
      
        fourBtn.setText("4");
        fourBtn.setFont(Font.font(FONT_SIZE));
        fourBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        fourBtn.setMinWidth(PANE_WIDTH/ FOUR);
        fourBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
               if (output.equals(ZERO))
                {
                    output = "4";
                    
                }
                
                else
                {
                    output = output.concat("4");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button fiveBtn = new Button();
      
        fiveBtn.setText("5");
        fiveBtn.setFont(Font.font(FONT_SIZE));
        fiveBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        fiveBtn.setMinWidth(PANE_WIDTH/ FOUR);
        fiveBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "5";
                    
                }
                
                else
                {
                    output = output.concat("5");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button sixBtn = new Button();
      
        sixBtn.setText("6");
        sixBtn.setFont(Font.font(FONT_SIZE));
        sixBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        sixBtn.setMinWidth(PANE_WIDTH/ FOUR);
        sixBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "6";
                }
                
                else
                {
                    output = output.concat("6");
                    
                }
                
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button sevenBtn = new Button();
      
        sevenBtn.setText("7");
        sevenBtn.setFont(Font.font(FONT_SIZE));
        sevenBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        sevenBtn.setMinWidth(PANE_WIDTH/ FOUR);
        sevenBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
               if (output.equals(ZERO))
                {
                    output = "7";
                    
                }
                
                else
                {
                    output = output.concat("7");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button eightBtn = new Button();
      
        eightBtn.setText("8");
        eightBtn.setFont(Font.font(FONT_SIZE));
        eightBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        eightBtn.setMinWidth(PANE_WIDTH/ FOUR);
        eightBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "8";
                }
                
                else
                {
                    output = output.concat("8");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button nineBtn = new Button();
      
        nineBtn.setText("9");
        nineBtn.setFont(Font.font(FONT_SIZE));
        nineBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        nineBtn.setMinWidth(PANE_WIDTH/ FOUR);
        nineBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (output.equals(ZERO))
                {
                    output = "9";
                    
                }
                
                else
                {
                    output = output.concat("9");
                    
                }
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button dotBtn = new Button();
      
        dotBtn.setText(".");
        dotBtn.setFont(Font.font(FONT_SIZE));
        dotBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        dotBtn.setMinWidth(PANE_WIDTH/ FOUR);
        dotBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (dotCount == 0)
                {
                    output = output.concat(".");
                    myText.setText(output);
                    dotCount++;
                }
   
                else
                {
                    dotBtn.disarm();
                }
                
                myText.setText(String.format("%1.17s", output));
            }
          
        });
        
        Button equalBtn = new Button();
      
        equalBtn.setText("=");
        equalBtn.setFont(Font.font(FONT_SIZE));
        equalBtn.setStyle("-fx-text-fill: #ffffff; -fx-base: #FE9A2E;");
        equalBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        equalBtn.setMinWidth(PANE_WIDTH/ FOUR);
        equalBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            { 
                if(firstEquals == true)
                {
                    operand2 = output;
                }
            
                if (functionID == 1)
                {   
                    output = addition(operand1, operand2);
                    operand1 = output;
                }
                
                if (functionID == TWO)
                {
                    output = subtraction(operand1, operand2);
                    operand1 = output;
                }
                
                if (functionID == THREE)
                {
                    output = multiply(operand1, operand2);
                    operand1 = output;
                }
                
                if (functionID == FOUR)
                {
                    output = divide(operand1, operand2);
                    operand1 = output;
                }
                
                firstEquals = false;
                addCount = 0;
                dotCount = 0;
                subCount = 0;
                multiplyCount = 0;
                divideCount = 0;
                
                myText.setText(String.format("%1.17s", output));
                
                
            }
        });
        
        Button plusBtn = new Button();
      
        plusBtn.setText("+");
        plusBtn.setFont(Font.font(FONT_SIZE));
        plusBtn.setStyle("-fx-text-fill: #ffffff; -fx-base: #FE9A2E;");
        plusBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        plusBtn.setMinWidth(PANE_WIDTH/ FOUR);
        plusBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {   
                if (addCount == 0)
                {   
                    operand1 = output;
                    output = "0";
                    addCount++;
                    functionID = 1;
                }
                
                else if (addCount == 1 && output != "0")
                {
                    output = addition(operand1,output);
                    myText.setText(String.format("%1.17s", output));
                    addCount = 0;
                }
                dotCount = 0;
                
            }
        });
        
        Button minusBtn = new Button();
      
        minusBtn.setText("-");
        minusBtn.setFont(Font.font(FONT_SIZE));
        minusBtn.setStyle("-fx-text-fill: #ffffff; -fx-base: #FE9A2E;");
        minusBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        minusBtn.setMinWidth(PANE_WIDTH/ FOUR);
        minusBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (subCount == 0)
                {
                    operand1 = output;
                    output = "0";
                    subCount++;
                    functionID = (int)TWO;
                }
                
                else if (subCount == 1 && output != "0")
                {
                    output = subtraction(operand1,output);
                    myText.setText(String.format("%1.17s", output));
                    subCount = 0;
                }
                dotCount = 0;
            }
        });
        
        Button multiBtn = new Button();
        multiBtn.setText("X");
        multiBtn.setFont(Font.font(FONT_SIZE - FIVE));
        multiBtn.setStyle("-fx-text-fill: #ffffff; -fx-base: #FE9A2E;");
        multiBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        multiBtn.setMinWidth(PANE_WIDTH/ FOUR);
        multiBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (multiplyCount == 0)
                {
                    operand1 = output;
                    output = "0";
                    multiplyCount++;
                    functionID = (int)THREE;
                }
                
                else if (multiplyCount == 1 && output != "0")
                {
                    output = multiply(operand1,output);
                    myText.setText(String.format("%1.17s", output));
                    multiplyCount = 0;
                }
                dotCount = 0;
            }
        });
        
        Button divideBtn = new Button();
      
        divideBtn.setText("÷");
        divideBtn.setFont(Font.font(FONT_SIZE));
        divideBtn.setStyle("-fx-text-fill: #ffffff; -fx-base: #FE9A2E;");
        divideBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        divideBtn.setMinWidth(PANE_WIDTH/ FOUR);
        divideBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if (divideCount == 0)
                {
                    operand1 = output;
                    output = "0";
                    divideCount++;
                    functionID = (int) FOUR;
                }
                
                else if (divideCount == 1 && output != "0")
                {
                    output = divide(operand1,output);
                    myText.setText(String.format("%1.17s", output));
                    divideCount = 0;
                }
                dotCount = 0;
            }
        });
        
        Button clearBtn = new Button();
      
        clearBtn.setText("AC");
        clearBtn.setFont(Font.font(FONT_SIZE - FIVE));
        clearBtn.setStyle("-fx-base: #E6E6E6;");
        clearBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        clearBtn.setMinWidth(PANE_WIDTH/ FOUR);
        clearBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                operand1 = ZERO;
                output = ZERO;
                firstEquals = true;
                addCount = 0;
                dotCount = 0;
                subCount = 0;
                multiplyCount = 0;
                divideCount = 0;
                functionID = 0;
                myText.setText(output);
            }
        });
        
        Button percentBtn = new Button();
      
        percentBtn.setText("%");
        percentBtn.setFont(Font.font(FONT_SIZE));
        percentBtn.setStyle("-fx-base: #E6E6E6;");
        percentBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        percentBtn.setMinWidth(PANE_WIDTH/ FOUR);
        percentBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                output = percent(output);
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        Button plusMinusBtn = new Button();
      
        plusMinusBtn.setText("+/-");
        plusMinusBtn.setFont(Font.font(FONT_SIZE - FIVE));
        plusMinusBtn.setStyle("-fx-base: #E6E6E6;");
        plusMinusBtn.setMinHeight(PANE_HEIGHT/ SIX_POINT_FIVE);
        plusMinusBtn.setMinWidth(PANE_WIDTH/ FOUR);
        plusMinusBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            { 
                if (output.charAt(0) != '-' && !output.equals(ZERO))
                {
                    String temp = "-";
                    temp = temp.concat(output);
                    output = temp;
                }
                
                else if (output.equals(ZERO))
                {
                    
                }
                
                else
                {
                    output = output.substring(1);
                }
                
                myText.setText(String.format("%1.17s", output));
            }
        });
        
        GridPane root = new GridPane();
       
        root.add(myText, 0, 0, (int) FOUR, 1);
        root.add(zeroBtn, 0, (int) FIVE, (int) TWO, 1);
        root.add(oneBtn, 0, (int) FOUR);
        root.add(twoBtn, 1, (int) FOUR);
        root.add(threeBtn, (int) TWO, (int) FOUR);
        root.add(fourBtn, 0, (int) THREE);
        root.add(fiveBtn, 1, (int) THREE);
        root.add(sixBtn, (int) TWO, (int) THREE);
        root.add(sevenBtn, 0, (int) TWO);
        root.add(eightBtn, 1, (int) TWO);
        root.add(nineBtn, (int) TWO, (int) TWO);
        root.add(dotBtn, (int) TWO, (int) FIVE);
        root.add(equalBtn, (int)THREE ,(int) FIVE);
        root.add(plusBtn, (int) THREE, (int) FOUR);
        root.add(minusBtn, (int) THREE, (int) THREE);
        root.add(divideBtn, (int) THREE, 1);
        root.add(multiBtn,(int) THREE, (int) TWO);
        root.add(clearBtn, 0, 1);
        root.add(percentBtn, (int)TWO, 1);
        root.add(plusMinusBtn, 1, 1);
       
        root.setMinHeight(PANE_HEIGHT);
        root.setMinWidth(PANE_WIDTH);
        
        Scene scene = new Scene(root, PANE_WIDTH, PANE_HEIGHT);
        
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNIFIED);
        primaryStage.setMinHeight(PANE_HEIGHT);
        primaryStage.setMinWidth(PANE_WIDTH);
        primaryStage.setMaxHeight(PANE_HEIGHT);
        primaryStage.setMaxWidth(PANE_WIDTH);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    String addition(String a, String b)
    {
        String result = "";
        
        double number1 = 0;
        double number2 = 0;
        
        number1 = Double.parseDouble(a);
        number2 = Double.parseDouble(b);
        
        number1 += number2;
        
        DecimalFormat format = new DecimalFormat("0.###############");
        
        result = format.format(number1);
        
        return result;
    }
    
    String subtraction(String a, String b)
    {
        String result = "";
        
        double number1 = 0;
        double number2 = 0;
        
        number1 = Double.parseDouble(a);
        number2 = Double.parseDouble(b);
        
        number1 = number1 - number2;
        
        DecimalFormat format = new DecimalFormat("0.###############");
        
        result = format.format(number1);
        
        return result;
    }
    
    String multiply(String a, String b)
    {
        String result = "";
        
        double number1 = 0;
        double number2 = 0;
        
        number1 = Double.parseDouble(a);
        number2 = Double.parseDouble(b);
        
        number1 *= number2;
        
        DecimalFormat format = new DecimalFormat("0.###############");
        
        result = format.format(number1);
        
        return result;
    }
    
     String divide(String a, String b)
    {
        String result = "";
        
        double number1 = 0;
        double number2 = 0;
        
        number1 = Double.parseDouble(a);
        number2 = Double.parseDouble(b);
        
        if (number2 == 0)
        {
            result = "Not a Number";
            return result;
        }
        
        else
        {
            number1 = number1 / number2;
        
            DecimalFormat format = new DecimalFormat("0.###############");
        
            result = format.format(number1);
        
            return result;
        }
    }
    
    String percent(String num)
    {
        String result = "";
        
        double number = 0;
        
        number = Double.parseDouble(num);
        
        number = number / ONE_HUNDRED;
        
        result = Double.toString(number);
        
        return result;
    }
    
}
