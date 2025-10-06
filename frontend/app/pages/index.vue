<template>
  <div>
    <u-container>
      <UPageSection title="คณะเทคโนโลยีสารสนเทศ"
        description="คณะเทคโนโลยีสารสนเทศ มรภ.เพชรบุรี มุ่งผลิตบัณฑิตที่มีความรู้ ความสามารถด้านดิจิทัล พร้อมพัฒนาทักษะการเรียนรู้ตลอดชีวิต เพื่อตอบโจทย์โลกเทคโนโลยีที่เปลี่ยนแปลงอย่างรวดเร็ว"
        :features="features" />
      <u-stepper disabled :default-value="steppersState.stepperEnrollmentState" class="my-5" size="md" :items="steppers" />
    </u-container>
  </div>
</template>

<script lang="ts" setup>

import type { PageFeatureProps, StepperItem } from '@nuxt/ui';
import { useStepperEnrollment } from '~/states/StepperEnrollment';

const steppersState = useStepperEnrollment()

const features = ref<PageFeatureProps[]>([
  {
    title: 'หลักสูตร',
    description: 'ข้อมูลหลักสูตรการเรียนการสอนที่ทันสมัย ครอบคลุมด้านเทคโนโลยีดิจิทัล และตอบโจทย์ตลาดแรงงาน',
    icon: 'tdesign:course',
    to: '/major'
  },
  {
    title: 'ค่าธรรมเนียมการศึกษา',
    description: 'รายละเอียดค่าธรรมเนียมการศึกษาและค่าใช้จ่ายต่าง ๆ ที่ชัดเจนและโปร่งใส',
    icon: 'ri:price-tag-2-line',
    to: '/tuition-fees'
  },
  {
    title: 'ทุนการศึกษา',
    description: 'โอกาสรับทุนการศึกษาหลากหลายรูปแบบ เพื่อสนับสนุนและส่งเสริมการเรียนรู้ของนักศึกษา',
    icon: 'fluent:gift-card-money-24-filled',
    to: 'https://www.pbru.ac.th/pbru/scholarships',
    target: '_blank'
  },
  {
    title: 'ชีวิตนักศึกษา',
    description: 'กิจกรรมพัฒนาทักษะและประสบการณ์ ทั้งทางวิชาการ กีฬา และชมรม เพื่อสร้างความสมดุลในการเรียนรู้',
    icon: 'mdi:school-outline',
    to: '/student-life'
  },
  {
    title: 'สิ่งอำนวยความสะดวก',
    description: 'ห้องปฏิบัติการคอมพิวเตอร์ ทรัพยากรการเรียนรู้ และสิ่งอำนวยความสะดวกที่ทันสมัย รองรับการเรียนการสอน',
    icon: 'mdi:desktop-classic',
    to: '/facilities'
  },
  {
    title: 'สหกิจศึกษาและการทำงาน',
    description: 'โอกาสฝึกงานและสหกิจศึกษา ร่วมมือกับภาคอุตสาหกรรม เพื่อเตรียมความพร้อมสู่สายงานจริง',
    icon: 'mdi:briefcase-check-outline',
    to: '/cooperative'
  },
])

const steppers = ref<StepperItem[]>([
  {
    title: 'กำลังเปิดรับสมัคร',
    description: 'เปิดให้ผู้สมัครลงทะเบียน',
    icon: 'i-lucide-door-open',
    status: 'success'
  },
  {
    title: 'ปิดการรับสมัคร',
    description: 'สิ้นสุดช่วงเวลาการสมัคร',
    icon: 'i-lucide-lock',
    status: 'warning'
  },
  {
    title: 'กำลังพิจารณา',
    description: 'อยู่ระหว่างการตรวจสอบผู้สมัคร',
    icon: 'i-lucide-search-check',
    status: 'info'
  },
  {
    title: 'ประกาศผล',
    description: 'ประกาศผลการคัดเลือกผู้สมัคร',
    icon: 'i-lucide-megaphone',
    status: 'primary'
  },
  {
    title: 'ยืนยันสิทธิ์',
    description: 'ผู้สมัครต้องยืนยันสิทธิ์การเข้าศึกษา',
    icon: 'i-lucide-user-check',
    status: 'success'
  },
  {
    title: 'สิ้นสุดกระบวนการ',
    description: 'การสมัครเสร็จสมบูรณ์',
    icon: 'i-lucide-check-circle',
    status: 'neutral'
  }
])

</script>

<style></style>