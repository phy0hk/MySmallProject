class Player{
    constructor(Name,Weapon){
        this.Weapon = Weapon || "Hand";
        this.Name = Name;
        this.health = 100;
        this.damage = WeaponDamage(Weapon);
    }
    status=()=>{
        console.log(`Name: ${this.Name}\nWeapon: ${this.Weapon}\nHealth: ${this.health}\nDamage: ${this.damage}`);
    }   
}
function WeaponDamage(Weapon){
    if(Weapon==="LightSaber"){
        return 100;
    }else if(Weapon==="Katana"){
        return 50;
    }
    else{
        return 5;
    }
}
const player = new Player("TawThar","LightSaber");
player.status();
const player0 = new Player("GG","Katana");
player0.status();

player.health -= player0.damage;
console.log(player.health);