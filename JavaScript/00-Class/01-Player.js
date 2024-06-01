class Player {
  constructor(name, type) {
    this.name = name;
    this.type = type;
  }
  introduce() {
    console.log(`Hi I am ${this.name}, I am a ${this.type}`);
  }
}

class Wizard extends Player {
  constructor(name, type) {
    super(name, type);
  }

  play() {
    console.log(`WEEEEE I am a ${this.type}`);
  }
}

const w1 = new Wizard("shelly", "Healer");
w1.play();
