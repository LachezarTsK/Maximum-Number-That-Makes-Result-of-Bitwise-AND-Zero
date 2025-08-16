
function maxNumber(input: number): number {
    const numberOfLeftShifts = Math.floor((Math.log2(input)));
    return Math.pow(2, numberOfLeftShifts) - 1;
};
