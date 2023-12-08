package allcharacters;

import character.EmotionalState;
import character.MainCharacter;
import character.PhysicalState;

public class Malish extends MainCharacter
{

    public Malish(EmotionalState emotionalState, PhysicalState physicalState, String name)
    {
        super(emotionalState, physicalState, name);
        CreateDreamsList();
        CreateScaryDreamsList();
        CreateEscapeActionsList();
    }

    public void Crying()
    {
        this.PerformAction("Малыш заплакал от страха, которым он был пропитан");
    }

    public void CloseEyes()
    {
        this.PerformAction(this.toString() + " зажмурил глаза, словно он думал, что становится от этого невидимым, и затаил дыхание");
    }
    public void Horror()
    {
        this.PerformAction("Малыша охватил ужас");
    }

    public void Seat()
    {
        this.PerformAction("Малыш сидел неподвижно и пытался вслушаться");
    }
    private void CreateDreamsList()
    {
        this.AddDream("\"Прошла уже целая вечность\"");
    }
    private void CreateScaryDreamsList()
    {
        this.AddScaryDream("\"Что будет, если нас обнаружат?\"");
        this.AddScaryDream("\"Надо быть очень тихими, чтобы Филле и Рулле не услышали нас\"");
        this.AddScaryDream("\"Как же страшно быть так близко к Филле и Рулле. Надеюсь, они не заметят нас\"");
    }

    private void CreateEscapeActionsList()
    {
        this.AddEscapeAction("Малыш быстро выскакивает из-под стола и бежит прочь, надеясь убежать от Филле и Рулле");
        this.AddEscapeAction("Он резко вскакивает на ноги и пытается прорваться сквозь Филле и Рулле, чтобы выбраться из комнаты");
        this.AddEscapeAction("Малыш смело направляется к двери, готовый на все, чтобы выбраться из ловушки");
    }

    @Override
    public String toString()
    {
        return "Малыш";
    }
}
