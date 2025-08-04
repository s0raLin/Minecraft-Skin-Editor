import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

// 数据类，代表天气信息
data class Weather(val condition: String, val temperature: Int)

// API 客户端接口
interface ApiClient {
    fun fetchWeather(city: String): Weather
}

// 天气服务类，依赖 ApiClient
class WeatherService(private val apiClient: ApiClient) {
    fun getWeather(city: String): Weather {
        return apiClient.fetchWeather(city)
    }
}

// 测试类，使用 MockK 模拟 ApiClient
class WeatherServiceTest {

    private val mockApiClient = mockk<ApiClient>() // 创建 ApiClient 的模拟对象
    private val weatherService = WeatherService(mockApiClient) // 把模拟对象注入 WeatherService

    @Test
    fun `test getWeather returns correct weather data`() {
        val city = "New York"
        val expectedWeather = Weather("Sunny", 25)

        every { mockApiClient.fetchWeather(city) } returns expectedWeather // 设置模拟行为




        val actualWeather = weatherService.getWeather(city)

        assertEquals(expectedWeather, actualWeather) // 断言结果符合预期

        verify { mockApiClient.fetchWeather(city) } // 验证方法被调用过
    }
}

