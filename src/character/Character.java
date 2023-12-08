package character;

import environment.Item;

import java.util.List;
import java.util.Random;

public abstract class Character
{
    private EmotionalState emotionalState;
    private PhysicalState physicalState;
    private String name;

    public Character(EmotionalState emotionalState, PhysicalState physicalState, String name)
    {
        this.emotionalState = emotionalState;
        this.physicalState = physicalState;
        this.name = name;
    }

    public String GetName()
    {
        return name;
    }

    public EmotionalState GetEmotionalState()
    {
        return emotionalState;
    }

    public PhysicalState GetPhysicalState()
    {
        return physicalState;
    }

    public void SetEmotionalState(EmotionalState emotionalState)
    {
        this.emotionalState = emotionalState;
    }

    public void SetPhysicalState(PhysicalState physicalState)
    {
        this.physicalState = physicalState;
    }

    public void PerformAction(String action)
    {
        System.out.print(action + ". ");
    }

    public void ChangeEmotionalState(EmotionalState emotionalState)
    {
        this.emotionalState = emotionalState;
    }
    public void ChangePhysicalState(PhysicalState physicalState)
    {
        this.physicalState = physicalState;
    }
    protected String GenerateAction(List<String> list)
    {
        Random random = new Random();
        String action = list.get(random.nextInt(list.size()));
        return action;
    }

}
