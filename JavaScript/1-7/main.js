class Taiyaki{
    constructor(name){
        this.name = name;
    }     
        display(){
            console.log("中身は"+this.name+"です");
        }
    
}
let taiyaki1 = new Taiyaki("あんこ");
let taiyaki2 = new Taiyaki("クリーム");
let taiyaki3 = new Taiyaki("チーズ");
taiyaki1.display();
taiyaki2.display();
taiyaki3.display();