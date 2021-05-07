export const round = (value: number, precision: number) => {
    var multplier = Math.pow(10, precision || 0);
    return Math.round(value * multplier) / multplier;
}

