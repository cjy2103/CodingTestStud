import java.util.*

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }.toIntArray()
    }

//    fun solution(array : IntArray, commands: Array<IntArray>) : IntArray{
//        val answer = IntArray(commands.size)
//        println(commands[0].contentToString())
//        for (pos in commands.indices){
//            val i = commands[pos][0]
//            val j = commands[pos][1]
//            val k = commands[pos][2]
//            val copyArr = IntArray(j-i+1)
//            System.arraycopy(array, i-1, copyArr, 0, copyArr.size)
//            Arrays.sort(copyArr)
//            answer[pos] = copyArr[k-1]
//        }
//        return answer
//    }
}

