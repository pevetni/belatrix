export class Rates {
    base: string;
    date: string;
    rates: Map<string, number>;
}

export class Rate {
    base: string;
    val: number;

    constructor(base: string, val: number) {
        this.base = base;
        this.val = val;
    }
}
