package qmelz.mod;

import mindustry.mod.*;
import mindustry.ctype.*;
import qmelz.mod.world.blocks.*;
import qmelz.mod.content.*;


class Main extends Mod{
    void loadContent(){
        new LangBlocks().load();
    }
}
