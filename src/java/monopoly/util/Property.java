package monopoly.util;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Property
{
    private String eventSource;
    private Button button;

    private Image question;
    private Image answers;
    private Image graphic;

    private boolean requiresGraphic;
    private boolean calculatorAllowed;

    public Property(String eventSource, Button button, Image question, Image answers, Image graphic, boolean requiresGraphic, boolean calculatorAllowed)
    {
        this.eventSource = eventSource;
        this.button = button;
        this.question = question;
        this.answers = answers;
        this.requiresGraphic = requiresGraphic;
        this.calculatorAllowed = calculatorAllowed;

        if(calculatorAllowed)
        {
            this.graphic = graphic;
        }
    }

    public boolean hasGraphic()
    {
        return requiresGraphic;
    }

    public boolean isCalculatorAllowed()
    {
        return calculatorAllowed;
    }

    public Image getGraphic()
    {
        if(requiresGraphic)
            return graphic;
        else
            return null;
    }

    public Button getButton()
    {
        return button;
    }

    public Image getQuestion()
    {
        return question;
    }

    public Image getAnswers()
    {
        return answers;
    }
}
