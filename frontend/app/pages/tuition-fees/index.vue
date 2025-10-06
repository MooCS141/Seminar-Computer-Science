<template>
  <div>
    <u-container>
      <u-breadcrumb class="my-4" :items="breadcrumbs" />
      <h1>Tuition fees</h1>
    </u-container>
  </div>
</template>

<script lang="ts" setup>
import type { BreadcrumbItem } from '@nuxt/ui';

const breadcrumbs = ref<BreadcrumbItem[]>([
  {
    label: 'หน้าหลัก',
    icon: 'i-lucide-house',
    to: '/'
  },
  {
    label: 'ค่าธรรมเนียมการศึกษา',
    icon: 'ri:price-tag-2-line',
    to: '/tuition-fees'
  },
])
</script>

<style>

</style>