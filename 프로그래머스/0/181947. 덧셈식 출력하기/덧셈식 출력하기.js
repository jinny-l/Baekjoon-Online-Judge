const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
    
    const a = parseInt(input[0]);
    const b = parseInt(input[1]);
    const c = a + b;
    console.log(`${a} + ${b} = ${c}`);
    
    rl.close();
});