package com.michalkordas.intellij.show.first;

/**
 * Why argue? Use both!
 */
class TabsVsSpaces {

    class Blood {
	    class Pain {
	        class Hell {
	    	    class Gunfire {
	    	        class Death {
	    	    	    class Prison {
	    	    	        class Chaos {
	    	    	    	    class Smoke {
	    	    	    	        class BadPlace {
	    	    	    	    	    class Destruction {
	    	    	    	    	        class Mortality {
	    	    	    	    	    	    class Extermination {
	    	    	    	    	    	    }
	    	    	    	    	        }
	    	    	    	    	    }
	    	    	    	        }
	    	    	    	    }
	    	    	        }
	    	    	    }
	    	        }
	    	    }
	        }
	    }
    }

    interface Murderer {
	    Blood kill(People people);
    }

    interface Executioner {
	    Blood kill(People people);
    }

    interface Raper {
	    Blood.Pain rape(People people);
    }

    private static class People {
    }
}

class BloodyHell {
	void goAndKill() {
		new TabsVsSpaces().new Blood();
	}
}
