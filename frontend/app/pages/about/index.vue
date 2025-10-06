<template>
  <div>
    <u-container>

      <u-breadcrumb class="my-6" :items="breadcrumbs" />

      <section class="relative">
        <nuxt-img src="http://localhost:3000/images/DSC_0552.jpg" alt="Faculty IT"
          class="w-full h-[400px] object-cover rounded-2xl shadow-md" quality="70" width="1200" height="628" />
        <div class="absolute inset-0 bg-black/40 rounded-2xl flex flex-col justify-center items-center text-white">
          <h1 class="text-4xl font-bold mb-2">คณะเทคโนโลยีสารสนเทศ</h1>
          <p class="text-lg text-gray-200">สร้างสรรค์นวัตกรรมเพื่ออนาคตดิจิทัล</p>
        </div>
      </section>

      <!-- About Section -->
      <section class="mt-10">
        <h2 class="text-2xl font-semibold mb-4">เกี่ยวกับคณะ</h2>
        <p class="leading-relaxed">
          คณะเทคโนโลยีสารสนเทศมีพันธกิจในการผลิตบัณฑิตที่มีความรู้ความสามารถด้านเทคโนโลยี
          พร้อมทั้งส่งเสริมการวิจัยและนวัตกรรมเพื่อพัฒนาสังคมในยุคดิจิทัลอย่างยั่งยืน
        </p>

        <div class="grid md:grid-cols-2 gap-6 mt-8">
          <u-card :ui="{
            root: 'rounded-xl'
          }">
            <template #header>
              <h3 class="text-xl font-semibold">วิสัยทัศน์</h3>
            </template>
            <p class="">
              เป็นผู้นำทางด้านเทคโนโลยีสารสนเทศที่ส่งเสริมการเรียนรู้และนวัตกรรมอย่างยั่งยืน
            </p>
          </u-card>

          <u-card :ui="{
            root: 'rounded-xl'
          }">
            <template #header>
              <h3 class="text-xl font-semibold">พันธกิจ</h3>
            </template>
            <ul class="list-disc list-inside space-y-2">
              <li>ผลิตบัณฑิตที่มีคุณภาพและมีคุณธรรม</li>
              <li>ส่งเสริมการวิจัยและพัฒนาเทคโนโลยีใหม่</li>
              <li>ให้บริการวิชาการแก่ชุมชนและสังคม</li>
            </ul>
          </u-card>
        </div>
      </section>

      <!-- Highlights Section -->
      <section class="mt-12">
        <h2 class="text-2xl font-semibold mb-6">สิ่งที่เราภูมิใจ</h2>
        <div class="grid sm:grid-cols-2 lg:grid-cols-3 gap-6">

          <u-blog-post :ui="{
            root: 'rounded-xl'
          }" class="hover:shadow-lg transition" title="ห้องปฏิบัติการทันสมัย" description=""
            image="http://localhost:3000/images/room.jpg" />

          <u-blog-post :ui="{
            root: 'rounded-xl'
          }" class="hover:shadow-lg transition" title="งานวิจัยที่ได้รับการตีพิมพ์" description=""
            image="http://localhost:3000/images/AKK.jpg" />

          <u-blog-post :ui="{
            root: 'rounded-xl'
          }" class="hover:shadow-lg transition" title="กิจกรรมสร้างสรรค์และสังคม" description=""
            image="http://localhost:3000/images/DSC_4272.jpg" />

        </div>
      </section>
    </u-container>
  </div>
</template>

<script setup lang="ts">
import type { BreadcrumbItem } from '@nuxt/ui'

const breadcrumbs = ref<BreadcrumbItem[]>([
  { label: 'หน้าหลัก', icon: 'i-lucide-house', to: '/' },
  { label: 'เกี่ยวกับคณะ', icon: 'ix:about', to: '/about' },
])
</script>
