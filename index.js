// Calm
const calm = x => { x != PERFECT && learn(); }


// Again
function again(x) {
  if (x == SUCCESS) {
    return x;
  } else {
    try {
      again(x);
    } catch (err) {
      console.log(err);
    }
  }
}


// Chickens
// eggs: Date[]
function birdCount(eggs) {
  let chickens = 0;
  const today = new Date();
  for (let i=0; i<=eggs.length; i++) {
    if (eggs[i] <= today) {
      // egg is hatched
      chickens++;
    } else {
      // do not count
    }
  }
  return chickens;
}


// Dagobah
function dagobah(task) {
  try {
    task();
  } catch(err) {
    console.log('No! Try not! Do or do not, there is no try.');
  }
}