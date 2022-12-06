package gonzalez.maritza.quiz
const val CURRENT_INDEX_KEY = "CURRENT_INDEX_KEY"
class QuizViewModel (private val savedStateHandle: SavedStateHandle) : ViewModel()  {
    private val bancoPregunta = listOf(
        Pregunta(R.string.pregunta_cielo, false),
        Pregunta(R.string.pregunta_lluvia, false),
        Pregunta(R.string.pregunta_clima, false),
        Pregunta(R.string.pregunta_lugar, false),
    )

    private var indice
        get() = savedStateHandle.get(CURRENT_INDEX_KEY) ?: 0
        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)
    val currentQuestionAnswer: Boolean
        get() = bancoPregunta [indice].respuesta
    val currentQuestionText: Int
        get() = bancoPregunta [indice].textPregunta
    fun moveToNext() {
        //indice = (indice + 1) % bancoPregunta .size
    }
}