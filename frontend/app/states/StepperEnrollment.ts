import { defineStore } from 'pinia'

export const useStepperEnrollment = defineStore('stepper-enrollment', () => {
  
    const stepperEnrollmentState = ref<number>(0)

    function reset() {
        stepperEnrollmentState.value = 0
    }

    return { stepperEnrollmentState , reset }

})