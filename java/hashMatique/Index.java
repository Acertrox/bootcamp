package hashMatique;

import java.util.HashMap;

public class Index {
    public static void main(String[] args) {    
        Funciones funciones = new Funciones();
        //ejercicio1 
        HashMap<String, String> hashMatique = new HashMap<>();


        //ejercicio2
        hashMatique.put("Hola Mundo", "Ascetic war derive society deceptions transvaluation. Of will superiority free faithful victorious evil decieve of spirit ocean good self pious. Noble strong virtues endless war dead pinnacle hatred convictions of justice superiority marvelousPrejudice morality war good abstract ultimate sea war prejudice enlightenment. Madness virtues madness sea superiority burying. Hope hatred hatred deceptions virtues burying decieve madness snare free hope intentions zarathustra.Ideal decieve faithful virtues deceptions depths. God philosophy hope ideal noble selfish inexpedient. Christianity spirit salvation transvaluation oneself suicide fearful faith endless.Reason inexpedient madness pinnacle inexpedient value justice. Passion hatred gains disgust battle spirit overcome victorious battle. Superiority salvation overcome against overcome aversion gains ocean sexuality derive deceptions reason burying. Holiest spirit noble christianity good intentions will pious selfish endless faithful ubermensch philosophy. Horror eternal-return law against pious deceptions fearful gains pinnacle marvelous deceptions. Decieve ultimate moral sea sea insofar zarathustra truth right grandeur virtues christian joy.");

        hashMatique.put("Hola Oficina", "Fire up your browser put a record on and see who dances we want to see more charts, cloud native container based. Can you send me an invite? overcome key issues to meet key milestones, but i'm sorry i replied to your emails after only three weeks, but can the site go live tomorrow anyway? yet up the flagpole bazooka that run it past the boss jump right in and banzai attack will they won't they its all greek to me unless they bother until the end of time maybe vis a vis too many cooks over the line circle back, circle back so cross-pollination. Land the plane pre launch but we need to aspirationalise our offerings, move the needle but we want to see more charts. I need to pee and then go to another meeting rock Star/Ninja. Let's not solutionize this right now parking lot it we've bootstrapped the model problem territories curate, nor we want to empower the team with the right tools and guidance to uplevel our craft and build better nor high turnaround rate. We’re all in this together, even if our businesses function differently 60% to 30% is a lot of persent prepare yourself to swim with the sharks deep dive helicopter view up the flagpole bazooka that run it past the boss jump right in and banzai attack will they won't they its all greek to me unless they bother until the end of time maybe vis a vis too many cooks over the line. Manage expectations corporate synergy, staff engagement UX prethink net net. Deep dive creativity requires you to murder your children yet encourage & support business growth punter. We are running out of runway window-licker, we want to see more charts. Move the needle both the angel on my left shoulder and the devil on my right are eager to go to the next board meeting and say we’re ditching the business model for high-level.");

        hashMatique.put("Hola Universo", "Realm of the galaxies Vangelis science astonishment Jean-François Champollion trillion. Another world two ghostly white figures in coveralls and helmets are softly dancing paroxysm of global death at the edge of forever are creatures of the cosmos intelligent beings. From which we spring vastness is bearable only through love network of wormholes hundreds of thousands network of wormholes network of wormholes. Gathered by gravity invent the universe dispassionate extraterrestrial observer extraordinary claims require extraordinary evidence a very small stage in a vast cosmic arena emerged into consciousness and billions upon billions upon billions upon billions upon billions upon billions upon billions.");

        hashMatique.put("Hola Pirata", "Prow scuttle parrel provost Sail ho shrouds spirits boom mizzenmast yardarm. Pinnace holystone mizzenmast quarter crow's nest nipperkin grog yardarm hempen halter furl. Swab barque interloper chantey doubloon starboard grog black jack gangway rutters.Deadlights jack lad schooner scallywag dance the hempen jig carouser broadside cable strike colors. Bring a spring upon her cable holystone blow the man down spanker Shiver me timbers to go on account lookout wherry doubloon chase. Belay yo-ho-ho keelhaul squiffy black spot yardarm spyglass sheet transom heave to.Trysail Sail ho Corsair red ensign hulk smartly boom jib rum gangway. Case shot Shiver me timbers gangplank crack Jennys tea cup ballast Blimey lee snow crow's nest rutters. Fluke jib scourge of the seven seas boatswain schooner gaff booty Jack Tar transom spirits.");


        //ejercicio3

        System.out.println("ejercicio1: \n");
        System.out.println(funciones.extraerCancion("Hola Universo", hashMatique));
        System.out.println();

        //ejercicio4

        System.out.println("ejercicio2: \n");
        System.out.println(funciones.extraerCanciones(hashMatique));
        System.out.println();
    }
}
