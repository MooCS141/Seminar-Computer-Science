<template>
  <div>
    <u-container>
      <u-breadcrumb class="my-4" :items="breadcrumbs" />
      <h1>Major</h1>
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
    label: 'ชีวิตนักศึกษา',
    icon: 'mdi:school-outline',
    to: '/student-life'
  },
])
</script>

<style>

</style>