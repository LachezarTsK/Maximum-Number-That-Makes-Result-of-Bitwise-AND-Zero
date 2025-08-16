
/**
 * @param {number} input
 * @return {number}
 */
var maxNumber = function (input) {
    const numberOfLeftShifts = Math.floor((Math.log2(input)));
    return Math.pow(2, numberOfLeftShifts) - 1;
};
