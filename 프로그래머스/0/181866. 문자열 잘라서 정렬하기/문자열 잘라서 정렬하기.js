function solution(myString) {
    return myString.split("x", -1).filter(value => value !== '').sort();
}