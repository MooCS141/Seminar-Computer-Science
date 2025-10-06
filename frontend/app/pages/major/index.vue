<template>
  <div>
    <u-container>

      <u-breadcrumb class="my-6" :items="breadcrumbs" />

      <div class="grid sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4">

        <UBlogPost title="วิทยาการคอมพิวเตอร์"
          description="Discover Nuxt Icon v1 - a modern, versatile"
          image="http://localhost:3000/images/18705.jpg" date="2024-11-25" to="/" target="_blank" />

        <UBlogPost title="เทคโนโลยีสารสนเทศ"
          description="Discover Nuxt Icon v1 - a modern, versatile"
          image="http://localhost:3000/images/3176.jpg" date="2024-11-25" to="https://nuxt.com/blog/nuxt-icon-v1-0"
          target="_blank" />

        <UBlogPost title="คอมพิวเตอร์(ค.บ)"
          description="Discover Nuxt Icon v1 - a modern, versatile"
          image="http://localhost:3000/images/18211.jpg" date="2024-11-25" to="https://nuxt.com/blog/nuxt-icon-v1-0"
          target="_blank" />

        <UBlogPost title="Introducing"
          description="Discover Nuxt Icon v1 - a modern, versatile"
          image="http://localhost:3000/images/105399.jpg" date="2024-11-25" to="https://nuxt.com/blog/nuxt-icon-v1-0"
          target="_blank" />

      </div>

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
    label: 'สาขาวิชา',
    icon: 'tdesign:course',
    to: '/major'
  },
])
</script>

<style></style>