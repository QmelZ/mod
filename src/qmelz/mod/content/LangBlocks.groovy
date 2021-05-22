package qmelz.mod.content;

import mindustry.ctype.*;
import arc.util.*;
import qmelz.mod.world.blocks.*;


class LangBlocks implements ContentList{
    def java, groovy, scala, kotlin;
    
    void load(){
        java = new Java("java");
        groovy = new Groovy("groovy");
        scala = new Scala("scala");
        kotlin = new Kotlin("kotlin");
    }
}
