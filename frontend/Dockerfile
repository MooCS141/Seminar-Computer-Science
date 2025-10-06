FROM node:22-alpine3.22 AS builder

RUN npm install -g pnpm@latest-10

WORKDIR /frontend

COPY package.json pnpm-lock.yaml ./

RUN pnpm install

COPY . .

RUN pnpm run build

FROM node:22-alpine3.22 AS runner

WORKDIR /app

COPY --from=builder /frontend/.output ./

ENTRYPOINT [ "node", "./server/index.mjs" ]