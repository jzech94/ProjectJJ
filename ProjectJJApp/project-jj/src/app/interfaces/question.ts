import IAnswers from "./answers"

export default interface IQuestion {
    "id": number
    "question": string
    "answers": IAnswers[]
    "correctAnswer": string
    "correctAnswerNum": number
    "explanation": string
    "imageHref": string
    "selected": number
}
