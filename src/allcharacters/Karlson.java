package allcharacters;

import character.EmotionalState;
import character.MainCharacter;
import character.PhysicalState;

public class Karlson extends MainCharacter
{
    public Karlson(EmotionalState emotionalState, PhysicalState physicalState, String name)
    {
        super(emotionalState, physicalState, name);
        CreateEscapeActionsList();
    }

    private void CreateEscapeActionsList()
    {
        this.AddEscapeAction("Когда Карлсон услышал шум и понял, что в квартиру проникли грабители, он быстро подбежал к окну и сделал рывок вверх, чтобы улететь");
        this.AddEscapeAction("Ощущая опасность, Карлсон мгновенно развернулся и с легкостью пролетел через окно, оставляя грабителей в изумлении");
        this.AddEscapeAction("Сердитые голоса грабителей заставили Карлсона моментально реагировать - он метнулся к окну и с легкостью выскочил наружу, исчезая в ночном небе");
    }
}
