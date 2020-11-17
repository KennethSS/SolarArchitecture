package com.solar.remote

import com.solar.data.model.FoodEntity
import com.solar.remote.impl.FoodRemoteImpl
import com.solar.remote.mapper.FoodEntityMapper
import com.solar.remote.retrofit.ApiClient
import com.solar.remote.service.FoodService
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import java.util.*
import javax.naming.Context
import javax.swing.tree.TreeNode

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleUnitTest {

    @Mock
    private lateinit var mockContext: Context

    private lateinit var service: FoodService
    private lateinit var foodRemoteImpl: FoodRemoteImpl

    @Before
    fun setup() {
        service = ApiClient.provideAppService(true) //mock()
        foodRemoteImpl = FoodRemoteImpl(service, FoodEntityMapper())
    }

    @Test
    fun getFoodList() {
        val foodEntities = mutableListOf<FoodEntity>()
        val testObserver = foodRemoteImpl.getFoodList().test()
        testObserver.assertComplete()
    }

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {

        val arr = arrayListOf<Int>()

        commands.forEach { commend ->
            var answer = intArrayOf()
            val range = array.copyOfRange(commend[0]-1, commend[1])
            range.forEach {
                println("range" + it)
            }
            val sort = range.sorted()
            sort.forEach {
                println("sort" + it)
            }

            val elemenet = sort.get(commend[2]-1)
            arr.add(elemenet)

            println("solution" + elemenet)
        }

        return arr.toIntArray()
    }
    @Test
    fun addition_isCorrect() {
        var s = "Zbcdefg"
        println(s.toCharArray().sortedDescending().joinToString(""))

        solution(intArrayOf(1,5,2,6,3,7,4), arrayOf(intArrayOf(2,5,3)))
        val iarry = intArrayOf(4,3,2,1)


        val array = arrayListOf<Int>()
        array.toIntArray()


        val range = iarry.copyOfRange(1,2)
        val sorted = range.sorted()


        iarry.average()
        var answer = intArrayOf()


        val sort = iarry.sorted()

        val first = sort.first()
        val firstIndex = sort.indexOf(first)
        val arr = arrayListOf<Int>()
        iarry.forEachIndexed { index, i ->
            if (index != firstIndex)9
                arr.add(i)
        }





        arr.toIntArray().forEach {
            println(it)
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        //assertThat()
    }
}