package environment;

import allcharacters.FillieAndRullie;
import allcharacters.Karlson;
import allcharacters.Malish;
import character.EmotionalState;
import character.PhysicalState;

public class Scene
{
    Malish malish = new Malish(EmotionalState.CALM, PhysicalState.SEATING, "Малыш");
    Karlson karlson = new Karlson(EmotionalState.CALM, PhysicalState.SEATING, "Карлсон");
    FillieAndRullie robbers = new FillieAndRullie(EmotionalState.CALM, PhysicalState.SNEAKING, "Филле и Рулле");
    public void MakeScene()
    {
        System.out.println("Потом они оба, дядя Юлиус и фрекен Бок, исчезли, каждый в своей комнате, " +
            "и снова воцарилась полная тишина. " +
            "Карлсон и Малыш сидели под столом и ждали.");
        malish.Think();
        robbers.Enter();

        if(Math.random() > 0.5)
        {
            robbers.SetNoiseMadeBool(true);
            robbers.PerformAction("Грабители издали звук");
            if(Math.random() > 0.2)
            {
                malish.SetEmotionalState(EmotionalState.TERRIFIED);
                malish.Crying();
                karlson.Escape();
                System.out.println("\nМамочка оказалась кинута под столом наедине с грабителями.");

            }
            else if(Math.random() < 0.1)
            {
                malish.SetEmotionalState(EmotionalState.COURAGE);
                malish.Escape();
                karlson.Escape();
                System.out.println("\nМамочка оказалась кинута под столом наедине с грабителями.");
            }
            else
            {
                malish.SetEmotionalState(EmotionalState.CALM);
                malish.Seat();
            }

            if(malish.IsNotiable() == true)
            {
                malish.SetEmotionalState(EmotionalState.FRIGHTENED);
                malish.Crying();
                robbers.Catch();
            }
        }
        else
        {
            robbers.SetNoiseMadeBool(false);
            robbers.PerformAction("Они вошли не издавая ни звука");
            malish.Seat();
            robbers.KeepGoing();


        }
        if(malish.IsNotiable() == false && malish.GetEmotionalState() == EmotionalState.CALM)
        {
            FlashLight flashLight = new FlashLight();
            robbers.PerformAction(flashLight.Use());
            System.out.println("Края скатерти свисали низко, но все же Филле и Рулле легко могли обнаружить под столом их троих -- его, Карлсона и Мамочку");
            malish.CloseEyes();
            robbers.Whisper();
        }
    }
}
