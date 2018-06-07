export class Lien {
    private id:     String;
    private name:   String;
    private title:  String;
    private content: String;
    private type:   String;

    public constructor(id: String, name: String, title: String, content: String, type: String) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
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
