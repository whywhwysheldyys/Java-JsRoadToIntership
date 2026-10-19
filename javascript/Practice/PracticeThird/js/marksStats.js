"use strict";

const scoresFirst = [4, 5, 3, 5, 2, 4];

function getStudentStats (scores) {

    let scoreSum = 0;

    for (let i = 0; i < scores.length; i++) {
      scoreSum += scores[i];
    }
      const minScore = Math.min(...scores);
      const maxScore = Math.max(...scores);
      const averageScore = (scoreSum / (scores.length)).toFixed(2);

      //console.log(`Средний балл: ${averageScore} , Минимальный балл: ${minScore} , Максимальный балл: ${maxScore}`);

      return {
        averageScore : Number(averageScore),
        max: maxScore,
        min: minScore
      };
}

const stats = getStudentStats(scoreFirst);

getStudentStats(stats);
