<script setup lang="ts">

import type { NavigationMenuItem } from '@nuxt/ui'

const items = computed<NavigationMenuItem[]>(() => [
  {
    label: 'เกี่ยวกับคณะ',
    to: '/about',
  },
  {
    label: 'สาขาวิชา',
    to: '/major',
  },
  {
    label: 'บุคลากร',
    to: '/personnel',
  },
  {
    label: 'ช่องทางติดต่อ',
    to: '/contact',
  },
  {
    label: 'ข่าวสาร',
    to: '/blog',
  }
])

</script>

<template>
  <UHeader>
    <template #title>
      <h1>คณะเทคโนโลยีสารสนเทศ</h1>
    </template>

    <UNavigationMenu :items="items" />

    <template #right>
      <UColorModeButton />

      <UButton color="neutral" variant="ghost" to="/login" target="_blank"
        icon="streamline-flex:user-identifier-card-solid" aria-label="Auth" />

    </template>

    <template #body>
      <UNavigationMenu :items="items" orientation="vertical" class="-mx-2.5" />
    </template>

  </UHeader>
</template>
