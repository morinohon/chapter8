//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト");
        //h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = '8';

        h.sit(5);
        while(h.hp > 500){
            h.sleep();
        }
        h.sit(25);
        h.run();

        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        h.name = "ミナト";
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);

        Hero h1 = new Hero("ミナト");
        System.out.println(h.hp);
        System.out.println(h.name);
        //h1.name = "ミナト";
        //h1.hp = 100;
        //Hero h2 = new Hero("アサカ");
        //h2.name = "アサカ";
        //h2.hp = 100;
        Wizard w =  new Wizard("スガワラ");
        //w.name = "スガワラ";
        w.hp = 50;
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}