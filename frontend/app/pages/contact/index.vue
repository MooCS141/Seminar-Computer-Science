<template>
  <div>
    <u-container>
      <u-breadcrumb class="my-4" :items="breadcrumbs" />
      <h1>Contact</h1>
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
    label: 'ช่องทางติดด่อ',
    icon: 'fluent:contact-card-link-16-regular',
    to: '/contact'
  },
])
</script>

<style>

</style>