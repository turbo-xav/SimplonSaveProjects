export class Lien {
    private id:     String;
    private name:   String;
    private type:   String;

    public constructor(id: String, name: String, type: String) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public getId() {
        return this.id;
    }

    public getName() {
        return this.name;
    }

    public getType() {
        return this.type;
    }
}
