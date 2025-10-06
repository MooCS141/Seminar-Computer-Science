<template>
  <div>
    <u-container>
      <u-breadcrumb class="my-4" :items="breadcrumbs" />
      <h1>Blog ID : {{ route.params.id }}</h1>
    </u-container>
  </div>
</template>

<script lang="ts" setup>
import type { RouteLocationNormalizedGeneric } from 'vue-router';

const route : RouteLocationNormalizedGeneric = useRoute();

import type { BreadcrumbItem } from '@nuxt/ui';

const breadcrumbs = ref<BreadcrumbItem[]>([
  {
    label: 'หน้าหลัก',
    icon: 'i-lucide-house',
    to: '/'
  },
  {
    label: 'ข่าวสาร',
    icon: 'streamline-plump:news-paper-remix',
    to: '/blog'
  },
  {
    label: `${route.params.id}`,
    icon: 'jam:newspaper-f',
    to: `/blog/${route.params.id}`
  },
])

</script>

<style>

</style>